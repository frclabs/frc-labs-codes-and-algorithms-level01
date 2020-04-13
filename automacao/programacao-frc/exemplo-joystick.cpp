#include <frc/Joystick.h>

class Robot : public frc::TimedRobot
{
	frc::Joystick m_stick{0};

public:
	void TeleopPeriodic()
	{
		if (m_stick.GetRawButton(0))
		{
			// Botão apertado, faça algo.
		}
		else
		{
			// Botão não pressionado, faça outra coisa.
		}
	}
};

#ifndef RUNNING_FRC_TESTS
int main()
{
	return frc::StartRobot<Robot>();
}
#endif
