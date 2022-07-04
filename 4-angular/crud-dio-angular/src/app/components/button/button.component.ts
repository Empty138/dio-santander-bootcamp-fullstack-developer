import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { TitleStrategy } from '@angular/router';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {
  @Input() btnText: string = 'Clique';
  @Input() btnType: string = '';
  @Output() clickChildren = new EventEmitter;
  textFilho = 'clicou no filho';

  constructor() { }

  ngOnInit(): void {
  }

  clicou(){
    this.clickChildren.emit(this.textFilho);
  }

}
