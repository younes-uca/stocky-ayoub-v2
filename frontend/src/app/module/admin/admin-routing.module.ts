
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';

import { LoginAdminComponent } from './login-admin/login-admin.component';
import { RegisterAdminComponent } from './register-admin/register-admin.component';

@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [
                        {
                            path: 'login',
                            children: [
                                {
                                    path: '',
                                    component: LoginAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {
                            path: 'register',
                            children: [
                                {
                                    path: '',
                                    component: RegisterAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {
                            path: 'sortie',
                            loadChildren: () => import('./view/sortie/sortie-admin-routing.module').then(x => x.SortieAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {
                            path: 'entree',
                            loadChildren: () => import('./view/entree/entree-admin-routing.module').then(x => x.EntreeAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {
                            path: 'commun',
                            loadChildren: () => import('./view/commun/commun-admin-routing.module').then(x => x.CommunAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {
                            path: 'effet',
                            loadChildren: () => import('./view/effet/effet-admin-routing.module').then(x => x.EffetAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class AdminRoutingModule { }
