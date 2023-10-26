import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from 'primeng/fileupload';
import {FullCalendarModule} from '@fullcalendar/angular';

import { BanqueCreateAdminComponent } from './banque/create/banque-create-admin.component';
import { BanqueEditAdminComponent } from './banque/edit/banque-edit-admin.component';
import { BanqueViewAdminComponent } from './banque/view/banque-view-admin.component';
import { BanqueListAdminComponent } from './banque/list/banque-list-admin.component';
import { BeneficiaireCreateAdminComponent } from './beneficiaire/create/beneficiaire-create-admin.component';
import { BeneficiaireEditAdminComponent } from './beneficiaire/edit/beneficiaire-edit-admin.component';
import { BeneficiaireViewAdminComponent } from './beneficiaire/view/beneficiaire-view-admin.component';
import { BeneficiaireListAdminComponent } from './beneficiaire/list/beneficiaire-list-admin.component';
import { PaiementCreateAdminComponent } from './paiement/create/paiement-create-admin.component';
import { PaiementEditAdminComponent } from './paiement/edit/paiement-edit-admin.component';
import { PaiementViewAdminComponent } from './paiement/view/paiement-view-admin.component';
import { PaiementListAdminComponent } from './paiement/list/paiement-list-admin.component';
import { TauxTvaCreateAdminComponent } from './taux-tva/create/taux-tva-create-admin.component';
import { TauxTvaEditAdminComponent } from './taux-tva/edit/taux-tva-edit-admin.component';
import { TauxTvaViewAdminComponent } from './taux-tva/view/taux-tva-view-admin.component';
import { TauxTvaListAdminComponent } from './taux-tva/list/taux-tva-list-admin.component';
import { ProprietaireChequeEffetCreateAdminComponent } from './proprietaire-cheque-effet/create/proprietaire-cheque-effet-create-admin.component';
import { ProprietaireChequeEffetEditAdminComponent } from './proprietaire-cheque-effet/edit/proprietaire-cheque-effet-edit-admin.component';
import { ProprietaireChequeEffetViewAdminComponent } from './proprietaire-cheque-effet/view/proprietaire-cheque-effet-view-admin.component';
import { ProprietaireChequeEffetListAdminComponent } from './proprietaire-cheque-effet/list/proprietaire-cheque-effet-list-admin.component';
import { CompteCreateAdminComponent } from './compte/create/compte-create-admin.component';
import { CompteEditAdminComponent } from './compte/edit/compte-edit-admin.component';
import { CompteViewAdminComponent } from './compte/view/compte-view-admin.component';
import { CompteListAdminComponent } from './compte/list/compte-list-admin.component';
import { TypePaiementCreateAdminComponent } from './type-paiement/create/type-paiement-create-admin.component';
import { TypePaiementEditAdminComponent } from './type-paiement/edit/type-paiement-edit-admin.component';
import { TypePaiementViewAdminComponent } from './type-paiement/view/type-paiement-view-admin.component';
import { TypePaiementListAdminComponent } from './type-paiement/list/type-paiement-list-admin.component';
import { ProprietaireChequeEffetBanqueCreateAdminComponent } from './proprietaire-cheque-effet-banque/create/proprietaire-cheque-effet-banque-create-admin.component';
import { ProprietaireChequeEffetBanqueEditAdminComponent } from './proprietaire-cheque-effet-banque/edit/proprietaire-cheque-effet-banque-edit-admin.component';
import { ProprietaireChequeEffetBanqueViewAdminComponent } from './proprietaire-cheque-effet-banque/view/proprietaire-cheque-effet-banque-view-admin.component';
import { ProprietaireChequeEffetBanqueListAdminComponent } from './proprietaire-cheque-effet-banque/list/proprietaire-cheque-effet-banque-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    BanqueCreateAdminComponent,
    BanqueListAdminComponent,
    BanqueViewAdminComponent,
    BanqueEditAdminComponent,
    BeneficiaireCreateAdminComponent,
    BeneficiaireListAdminComponent,
    BeneficiaireViewAdminComponent,
    BeneficiaireEditAdminComponent,
    PaiementCreateAdminComponent,
    PaiementListAdminComponent,
    PaiementViewAdminComponent,
    PaiementEditAdminComponent,
    TauxTvaCreateAdminComponent,
    TauxTvaListAdminComponent,
    TauxTvaViewAdminComponent,
    TauxTvaEditAdminComponent,
    ProprietaireChequeEffetCreateAdminComponent,
    ProprietaireChequeEffetListAdminComponent,
    ProprietaireChequeEffetViewAdminComponent,
    ProprietaireChequeEffetEditAdminComponent,
    CompteCreateAdminComponent,
    CompteListAdminComponent,
    CompteViewAdminComponent,
    CompteEditAdminComponent,
    TypePaiementCreateAdminComponent,
    TypePaiementListAdminComponent,
    TypePaiementViewAdminComponent,
    TypePaiementEditAdminComponent,
    ProprietaireChequeEffetBanqueCreateAdminComponent,
    ProprietaireChequeEffetBanqueListAdminComponent,
    ProprietaireChequeEffetBanqueViewAdminComponent,
    ProprietaireChequeEffetBanqueEditAdminComponent,
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
    FullCalendarModule,

  ],
  exports: [
  BanqueCreateAdminComponent,
  BanqueListAdminComponent,
  BanqueViewAdminComponent,
  BanqueEditAdminComponent,
  BeneficiaireCreateAdminComponent,
  BeneficiaireListAdminComponent,
  BeneficiaireViewAdminComponent,
  BeneficiaireEditAdminComponent,
  PaiementCreateAdminComponent,
  PaiementListAdminComponent,
  PaiementViewAdminComponent,
  PaiementEditAdminComponent,
  TauxTvaCreateAdminComponent,
  TauxTvaListAdminComponent,
  TauxTvaViewAdminComponent,
  TauxTvaEditAdminComponent,
  ProprietaireChequeEffetCreateAdminComponent,
  ProprietaireChequeEffetListAdminComponent,
  ProprietaireChequeEffetViewAdminComponent,
  ProprietaireChequeEffetEditAdminComponent,
  CompteCreateAdminComponent,
  CompteListAdminComponent,
  CompteViewAdminComponent,
  CompteEditAdminComponent,
  TypePaiementCreateAdminComponent,
  TypePaiementListAdminComponent,
  TypePaiementViewAdminComponent,
  TypePaiementEditAdminComponent,
  ProprietaireChequeEffetBanqueCreateAdminComponent,
  ProprietaireChequeEffetBanqueListAdminComponent,
  ProprietaireChequeEffetBanqueViewAdminComponent,
  ProprietaireChequeEffetBanqueEditAdminComponent,
  ],
  entryComponents: [],
})
export class EffetAdminModule { }
