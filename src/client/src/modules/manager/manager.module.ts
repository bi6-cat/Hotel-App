import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { BookingListComponent } from './booking/booking-list.component';
import { RoleListComponent } from './role/role-list.component';
import { RoomListComponent } from './room/room-list.component';
import { ServiceListComponent } from './service/service-list.component';

const routes: Routes = [
  {
    path: 'booking',
    component: BookingListComponent,
  },
  {
    path: 'role',
    component: RoleListComponent,
  },
  {
    path: 'room',
    component: RoomListComponent,
  },
  {
    path: 'service',
    component: ServiceListComponent,
  },
  {
    path: '**',
    redirectTo: '',
    pathMatch: 'full',
  }
];

@NgModule({
  declarations: [],
  imports: [CommonModule, RouterModule.forChild(routes)],
})
export class ManagerModule {}
