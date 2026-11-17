import { TestBed } from '@angular/core/testing';
import { App } from './app';

describe('App', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [App],
    })
      .compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(App);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it('should render title', async () => {
    const fixture = TestBed.createComponent(App);
    await fixture.whenStable();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('h1')?.textContent).toContain('My Tasks');
    expect(compiled.querySelector('app-task-item')?.textContent).toContain('task-item works!');
  });

  it('should toggle a task as completed', async () => {
    const fixture = TestBed.createComponent(App);
    const app = fixture.componentInstance;
    app.addTask('Write tests');
    fixture.detectChanges();

    expect(app.remaining()).toBe(1);
    expect(fixture.nativeElement.textContent).toContain('1 remaining');

    const checkbox = fixture.nativeElement.querySelector('input[type="checkbox"]') as HTMLInputElement;
    checkbox.checked = true;
    checkbox.dispatchEvent(new Event('change'));
    fixture.detectChanges();

    expect(app.tasks()[0].completed).toBe(true);
    const taskTitle = fixture.nativeElement.querySelector('li span') as HTMLSpanElement;
    expect(taskTitle.textContent).toContain('Write tests');
    expect(taskTitle.style.textDecoration).toBe('line-through');
    expect(app.remaining()).toBe(0);
    expect(fixture.nativeElement.textContent).toContain('0 remaining');
  });
});
