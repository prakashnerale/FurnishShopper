import { Component, OnInit } from '@angular/core';
import { Item } from 'src/app/models/item';

@Component({
  selector: 'app-add-item',
  templateUrl: './add-item.component.html',
  styleUrls: ['./add-item.component.css']
})
export class AddItemComponent implements OnInit {

 private newItem: Item = new Item();
 private itemAdded: boolean;


  constructor() { }
s
  ngOnInit() {
  }

}
