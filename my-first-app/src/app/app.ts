import { Component, computed, signal } from '@angular/core';
import { TaskItem } from './task-item/task-item';

@Component({
  imports: [TaskItem],
  selector: 'app-root',
  template: `
    <h1>My Tasks</h1>

    <input #taskInput placeholder="New task" />
    <button (click)="addTask(taskInput.value); taskInput.value = ''">Add</button>
    <ul>
      @for (task of tasks(); track task.id) {
        <li>
          <input
            type="checkbox"
            [checked]="task.completed"
            (change)="toggle(task.id)"
            [attr.aria-label]="'Mark ' + task.title + ' as complete'"
          />
          <span [style.text-decoration]="task.completed ? 'line-through' : 'none'">
            {{ task.title }}
          </span>
          <button (click)="removeTask(task.id)">x</button>
        </li>
      } @empty {
        <li>No tasks yet!</li>
      }
    </ul>

    <p>{{ tasks().length }} task(s)</p>
    <p>{{ remaining() }} remaining</p>
    <app-task-item></app-task-item>
  `,
})
export class App {
  private nextId = 1;
  tasks = signal<{ id: number; title: string; completed: boolean }[]>([]);
  remaining = computed(() => this.tasks().filter(task => !task.completed).length);

  addTask(title: string) {
    if (!title.trim()) return;
    this.tasks.update(list => [...list, { id: this.nextId++, title, completed: false }]);
  }

  toggle(id: number) {
    this.tasks.update(list =>
      list.map(task => task.id === id ? { ...task, completed: !task.completed } : task),
    );
  }

  removeTask(id: number) {
    this.tasks.update(list => list.filter(t => t.id !== id));
  }
}