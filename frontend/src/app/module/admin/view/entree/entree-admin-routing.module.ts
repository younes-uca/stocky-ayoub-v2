
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { InventaireListAdminComponent } from './inventaire/list/inventaire-list-admin.component';
import { EntreeProduitListAdminComponent } from './entree-produit/list/entree-produit-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'inventaire',
                            children: [
                                {
                                    path: 'list',
                                    component: InventaireListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'entree-produit',
                            children: [
                                {
                                    path: 'list',
                                    component: EntreeProduitListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class EntreeAdminRoutingModule { }
