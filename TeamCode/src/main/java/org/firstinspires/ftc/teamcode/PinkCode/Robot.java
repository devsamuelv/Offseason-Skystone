package org.firstinspires.ftc.teamcode.PinkCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.internal.vuforia.externalprovider.VuforiaWebcam;
import org.firstinspires.ftc.teamcode.PinkCode.Subsystems.DriveSystem;

@TeleOp(name = "Telop", group = "Telop")
public class Robot extends OpMode {
    private DriveSystem drive = null;

    @Override
    public void init() {
        drive = new DriveSystem(hardwareMap, telemetry);

        try {
            drive.hwmap.Init();
        } catch (Exception e) {
            telemetry.addData("[ERROR]", e.getCause() + " : " +  e.getMessage());
            telemetry.update();
        }
    }

    @Override
    public void loop() {
        drive.SafeTowerDrive(gamepad1.left_stick_y);
    }
}
