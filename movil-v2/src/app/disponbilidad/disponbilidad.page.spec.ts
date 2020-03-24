import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisponbilidadPage } from './disponbilidad.page';

describe('DisponbilidadPage', () => {
  let component: DisponbilidadPage;
  let fixture: ComponentFixture<DisponbilidadPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisponbilidadPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisponbilidadPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
