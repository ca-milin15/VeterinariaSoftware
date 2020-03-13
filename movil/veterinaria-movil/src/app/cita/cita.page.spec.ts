import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { CitaPage } from './cita.page';

describe('CitaPage', () => {
  let component: CitaPage;
  let fixture: ComponentFixture<CitaPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CitaPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(CitaPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
