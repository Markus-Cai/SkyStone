package org.firstinspires.ftc.teamcode.pioneerrobotics1920.AutonomousBlue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.pioneerrobotics1920.Core.Auton;

@Autonomous(name = "Autonomous Blue Loading Right")
public class AutonBlueLoadRight extends Auton {
    public AutonBlueLoadRight() {
        super();
        blue = true;
        startBuilding = false;
        left = false;
    }

}