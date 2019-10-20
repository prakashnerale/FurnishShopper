import { Component, OnInit } from '@angular/core';
import { Item } from 'src/app/models/item';
import { AddItemService } from 'src/app/services/add-item.service';

@Component({
  selector: 'app-add-item',
  templateUrl: './add-item.component.html',
  styleUrls: ['./add-item.component.css']
})
export class AddItemComponent implements OnInit {

 private newItem: Item = new Item();
 private itemAdded: boolean;


  constructor(private addItemService:AddItemService) { }

  onSubmit(){
    this.addItemService.sendItem(this.newItem).subscribe(
          res=>{
            this.itemAdded=true;
            this.newItem=new Item();
            this.newItem.manufacturer="Furnish"
            this.newItem.seller="FurnishShopper";
            this.newItem.category="Living";
            this.newItem.made="wood";
          } ,
          err=>{
                console.log(err);
       
              }
       ); 
  }
                
  ngOnInit() {
    this.itemAdded=false;
    this.newItem.active=false;
    this.newItem.manufacturer="Furnish"
    this.newItem.seller="FurnishShopper";
    this.newItem.category="Living";
    this.newItem.made="wood";

  }

}
