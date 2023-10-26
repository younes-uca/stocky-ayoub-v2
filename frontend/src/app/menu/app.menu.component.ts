import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import {
  trigger,
  state,
  style,
  transition,
  animate,
} from '@angular/animations';

import { AppComponent } from 'src/app/app.component';
import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { RoleService } from 'src/app/zynerator/security/Role.service';
import {AppMainComponent} from 'src/app/template/app.main.component';

@Component({
  selector: 'app-menu',
  templateUrl: './app.menu.component.html',
  animations: [
    trigger('inline', [
      state(
        'hidden',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visible',
        style({
          height: '*',
        })
      ),
      state(
        'hiddenAnimated',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visibleAnimated',
        style({
          height: '*',
        })
      ),
      transition(
        'visibleAnimated => hiddenAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
      transition(
        'hiddenAnimated => visibleAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
    ]),
  ],
})
export class AppMenuComponent implements OnInit {
  model: any[];
  modelanonymous: any[];
    modelAdmin: any[];
  constructor(public app: AppComponent, public appMain: AppMainComponent, private roleService: RoleService, private authService:AuthService, private router: Router) {}

  ngOnInit() {
    this.modelAdmin =
      [
              {
                label: 'Entree Produit',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste entree produit',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/entree/entree-produit/list']
                          },
                ]
              },
              {
                label: 'Beneficiaire Management',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste beneficiaire',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/effet/beneficiaire/list']
                          },
                ]
              },
              {
                label: 'Configuration Management',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste banque',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/effet/banque/list']
                          },
                          {
                            label: 'Liste taux tva',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/effet/taux-tva/list']
                          },
                          {
                            label: 'Liste compte',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/effet/compte/list']
                          },
                          {
                            label: 'Liste type paiement',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/effet/type-paiement/list']
                          },
                ]
              },
              {
                label: 'Sortie Produit',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste sortie produit',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/sortie/sortie-produit/list']
                          },
                ]
              },
              {
                label: 'Product',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste categorie produit',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/commun/categorie-produit/list']
                          },
                          {
                            label: 'Liste marque',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/commun/marque/list']
                          },
                          {
                            label: 'Liste depot',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/commun/depot/list']
                          },
                          {
                            label: 'Liste stock',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/commun/stock/list']
                          },
                ]
              },
              {
                label: 'Inventaire',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste inventaire',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/entree/inventaire/list']
                          },
                ]
              },
              {
                label: 'ProprietaireChequeEffet Management',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste proprietaire cheque effet',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/effet/proprietaire-cheque-effet/list']
                          },
                          {
                            label: 'Liste proprietaire cheque effet banque',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/effet/proprietaire-cheque-effet-banque/list']
                          },
                ]
              },
              {
                label: 'Paiement Management',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste paiement',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/effet/paiement/list']
                          },
                ]
              },
              {
                label: 'Divers',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste fournisseur',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/commun/fournisseur/list']
                          },
                          {
                            label: 'Liste collaborateur',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/commun/collaborateur/list']
                          },
                ]
              },
              {
                label: 'Produit',
                icon: 'pi pi-wallet',
                items: [
                          {
                            label: 'Liste produit',
                            icon: 'pi pi-fw pi-plus-circle',
                            routerLink: ['/app/admin/commun/produit/list']
                          },
                ]
              },
    ];
        if (this.authService.authenticated) {
            if (this.authService.authenticatedUser.roles) {
              this.authService.authenticatedUser.roles.forEach(role => {
                  const roleName: string = this.getRole(role);
                  this.roleService._role.next(roleName.toUpperCase());
                  eval('this.model = this.model' + this.getRole(role));
              })
            }
        }
  }

    getRole(text){
        const [role, ...rest] = text.split('_');
        return this.upperCaseFirstLetter(rest.join(''));
    }

    upperCaseFirstLetter(word: string) {
      if (!word) { return word; }
      return word[0].toUpperCase() + word.substr(1).toLowerCase();
    }

    onMenuClick(event) {
        this.appMain.onMenuClick(event);
    }
}
