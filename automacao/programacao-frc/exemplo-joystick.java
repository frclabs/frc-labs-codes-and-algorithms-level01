import edu.wpi.first.wpilibj.Joystick;

public class Robot extends TimedRobot {
	private final Joystick m_stick = new Joystick(0);

	@Override
	public void teleopPeriodic() {
		if (m_stick.getRawButton(0)) {
			// Botão apertado, faça algo.
		} else {
			// Botão não pressionado, faça outra coisa.
		}
	}
}
