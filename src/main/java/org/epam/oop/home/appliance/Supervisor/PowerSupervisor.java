package org.epam.oop.home.appliance.Supervisor;

import org.epam.oop.home.appliance.MyException.MaxPowerException;

public final class PowerSupervisor {

    private static int maxPower = 15000;

    public static void supervisor(int totalPower) throws MaxPowerException {
        if (totalPower > maxPower) throw new MaxPowerException("При текущей нагрузке, выше " + maxPower/1000 +
                                            "кВт, линия будет перегружена", maxPower);
    }
}
