import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuPruebaPage } from './menu-prueba.page';

describe('MenuPruebaPage', () => {
  let component: MenuPruebaPage;
  let fixture: ComponentFixture<MenuPruebaPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MenuPruebaPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuPruebaPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
