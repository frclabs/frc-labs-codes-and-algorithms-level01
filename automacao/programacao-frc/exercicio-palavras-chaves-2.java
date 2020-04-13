package edu.wpi.first.wpilibj.examples.canpdp;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
  private static final int kPDPId = 0;

  private final PowerDistributionPanel m_pdp = new PowerDistributionPanel(
      kPDPId);

  @Override
  public void robotPeriodic() {
    SmartDashboard.putNumber("Current Channel 7", m_pdp.getCurrent(7));
    SmartDashboard.putNumber("Voltage", m_pdp.getVoltage());
    SmartDashboard.putNumber("Temperature", m_pdp.getTemperature());
  }
}
