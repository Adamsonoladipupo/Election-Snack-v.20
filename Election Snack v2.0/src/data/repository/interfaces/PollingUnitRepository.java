package data.repository.interfaces;

import data.model.PollingUnit;

public interface PollingUnitRepository {
    void createPollingUnit(PollingUnit pollingUnit);
    void deleteAllPollingUnits();
}
