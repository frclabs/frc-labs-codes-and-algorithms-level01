#include <frc/Joystick.h>
#include <frc/SpeedControllerGroup.h>
#include <frc/Spark.h>

class Robot : public frc::TimedRobot
{
	frc::Spark m_motor1{1};
	frc::Spark m_motor2{2};

	frc::SpeedControllerGroup m_motores{m_motor1, m_motor2};

public:
	void TeleopPeriodic()
	{
		if (m_stick.GetRawButton(0))
		{
			m_motores.Set(0.4);
		}
		else
		{
			m_motores.Set(0.0);
		}
	}
};

#ifndef RUNNING_FRC_TESTS
int main()
{
	return frc::StartRobot<Robot>();
}
#endif
