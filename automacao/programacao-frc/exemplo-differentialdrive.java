import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Robot extends TimedRobot {
	private double leftSpeed = .1; // Apenas demonstração
	private double rigthSpeed = .1; // Apenas demonstração
	private final Spark m_leftFrontMotor = new Spark(0);
	private final Spark m_leftBackMotor = new Spark(0);
	private final Spark m_rightBackMotor = new Spark(2);
	private final Spark m_rightFrontMotor = new Spark(3);
	private final SpeedControllerGroup m_leftMotor = new SpeedControllerGroup(
			m_leftBackMotor, m_leftFrontMotor);
	private final SpeedControllerGroup m_rightMotor = new SpeedControllerGroup(
			m_rightBackMotor, m_rightFrontMotor);
	private final DifferentialDrive m_robotDrive = new DifferentialDrive(
			m_leftMotor, m_rightMotor);

	@Override
	public void teleopPeriodic() {
		m_robotDrive.tankDrive(leftSpeed, rigthSpeed);
		// Apenas demonstração
	}
}
