import { TestBed } from '@angular/core/testing';

import { AddItemService } from './add-item.service';

describe('AddItemService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddItemService = TestBed.get(AddItemService);
    expect(service).toBeTruthy();
  });
});
