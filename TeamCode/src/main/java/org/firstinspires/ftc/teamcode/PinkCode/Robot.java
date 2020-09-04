package org.firstinspires.ftc.teamcode.PinkCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.PinkCode.Subsystems.DriveSystem;

@TeleOp(name = "Telop", group = "Telop")
public class Robot extends OpMode {
    private DriveSystem drive = null;

    @Override
    public void init() {
        drive = new DriveSystem(hardwareMap, telemetry);
    }

    @Override
    public void loop() {
        if( gamepad1.left_stick_y > .1  ||
                gamepad1.left_stick_y < -.1 ||
                gamepad1.left_stick_x > .1  ||
                gamepad1.left_stick_x < -.1 ||
                gamepad1.right_stick_x > .1 ||
                gamepad1.right_stick_x < -.1) {

            drive.BaseDrive(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
        } else {
            drive.Stop();
        }
    }
}
