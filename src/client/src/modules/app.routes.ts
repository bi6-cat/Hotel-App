import { Routes } from '@angular/router';
import { CustomerLayoutComponent } from './shared/layouts/customer-layout/customer-layout.component';
import { ManagerLayoutComponent } from './shared/layouts/manager-layout/manager-layout.component';

export const routes: Routes = [
  {
    path: 'manager',
    component: ManagerLayoutComponent,
    loadChildren: () =>
      import('./manager/manager.module').then((m) => m.ManagerModule),
  },
  {
    path: '',
    component: CustomerLayoutComponent,
    loadChildren: () =>
      import('./customer/customer.module').then((m) => m.CustomerModule),
  },
];