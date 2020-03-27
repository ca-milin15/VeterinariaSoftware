import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarnetPage } from './carnet.page';

describe('CarnetPage', () => {
  let component: CarnetPage;
  let fixture: ComponentFixture<CarnetPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarnetPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarnetPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
