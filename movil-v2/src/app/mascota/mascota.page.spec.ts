import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MascotaPage } from './mascota.page';

describe('MascotaPage', () => {
  let component: MascotaPage;
  let fixture: ComponentFixture<MascotaPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MascotaPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MascotaPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
