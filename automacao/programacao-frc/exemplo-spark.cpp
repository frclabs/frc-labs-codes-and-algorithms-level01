#include <frc/Joystick.h>
#include <frc/Spark.h>

class Robot : public frc::TimedRobot
{
	frc::Joystick m_stick{0};
	frc::Spark m_motor{0};

public:
	void TeleopPeriodic()
	{
		if (m_stick.GetRawButton(0))
		{
			m_motor.Set(0.4);
		}
		else
		{
			m_motor.Set(0.0);
		}
	}
};

#ifndef RUNNING_FRC_TESTS
int main()
{
	return frc::StartRobot<Robot>();
}
#endif
