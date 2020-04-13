import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Robot extends TimedRobot {
	private final Joystick m_stick = new Joystick(0);
	private final Spark m_motor1 = new Spark(1);
	private final Spark m_motor2 = new Spark(2);
	SpeedControllerGroup m_motores = new SpeedControllerGroup(m_motor1, m_motor2);

	@Override
	public void teleopPeriodic() {
		if (m_stick.getRawButton(0)) {
			m_motores.set(0.4);
		} else {
			m_motores.set(0.0);
		}
	}
}
