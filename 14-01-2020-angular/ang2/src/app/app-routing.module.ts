import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DetailsComponent} from './component/details/details.component';
import {ViewComponent} from './component/view/view.component';
import {HomeComponent} from './component/home/home.component';
import {NotfoundComponent} from './component/notfound/notfound.component';



const routes: Routes = [
 { path: 'details' , component: DetailsComponent } ,
 { path: 'view' , component:ViewComponent },
 { path: 'home' , component: HomeComponent },
 { path: '' , redirectTo: './home' , pathMatch:"full" },
 { path: '**' ,component:NotfoundComponent  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
