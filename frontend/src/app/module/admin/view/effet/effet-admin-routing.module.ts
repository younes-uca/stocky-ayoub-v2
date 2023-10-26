
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { BanqueListAdminComponent } from './banque/list/banque-list-admin.component';
import { BeneficiaireListAdminComponent } from './beneficiaire/list/beneficiaire-list-admin.component';
import { PaiementListAdminComponent } from './paiement/list/paiement-list-admin.component';
import { TauxTvaListAdminComponent } from './taux-tva/list/taux-tva-list-admin.component';
import { ProprietaireChequeEffetListAdminComponent } from './proprietaire-cheque-effet/list/proprietaire-cheque-effet-list-admin.component';
import { CompteListAdminComponent } from './compte/list/compte-list-admin.component';
import { TypePaiementListAdminComponent } from './type-paiement/list/type-paiement-list-admin.component';
import { ProprietaireChequeEffetBanqueListAdminComponent } from './proprietaire-cheque-effet-banque/list/proprietaire-cheque-effet-banque-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'banque',
                            children: [
                                {
                                    path: 'list',
                                    component: BanqueListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'beneficiaire',
                            children: [
                                {
                                    path: 'list',
                                    component: BeneficiaireListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'paiement',
                            children: [
                                {
                                    path: 'list',
                                    component: PaiementListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'taux-tva',
                            children: [
                                {
                                    path: 'list',
                                    component: TauxTvaListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'proprietaire-cheque-effet',
                            children: [
                                {
                                    path: 'list',
                                    component: ProprietaireChequeEffetListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'compte',
                            children: [
                                {
                                    path: 'list',
                                    component: CompteListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'type-paiement',
                            children: [
                                {
                                    path: 'list',
                                    component: TypePaiementListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'proprietaire-cheque-effet-banque',
                            children: [
                                {
                                    path: 'list',
                                    component: ProprietaireChequeEffetBanqueListAdminComponent ,
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
export class EffetAdminRoutingModule { }
