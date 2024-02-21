import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { StoreModule } from '@ngrx/store';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PolicyListComponent } from './policy-list/policy-list.component';
import { policyReducer } from 'src/app/store/reducers/policy.reducer';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    PolicyListComponent,
    
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    StoreModule.forRoot({ policy: policyReducer }),
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
