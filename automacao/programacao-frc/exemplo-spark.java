import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;

public class Robot extends TimedRobot {
	private final Joystick m_stick = new Joystick(0);
	private final Spark m_spark = new Spark(0);

	@Override
	public void teleopPeriodic() {
		if (m_stick.getRawButton(0)) {
			m_spark.set(0.4);
		} else {
			m_spark.set(0.0);
		}
	}
}
