import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-adventures',
  templateUrl: './adventures.component.html',
  styleUrls: ['./adventures.component.css']
})
export class AdventuresComponent implements OnInit {

  title:string="Chose your adventure";
  constructor(){}

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}
