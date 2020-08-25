package org.firstinspires.ftc.teamcode.PinkCode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.PinkCode.Subsystems.DriveSystem;

@TeleOp(name = "Test Drive", group = "Telop")
public class Test extends OpMode {

    private DriveSystem drive = null;

    @Override
    public void init() {
        try {
            drive = new DriveSystem(hardwareMap, telemetry);

            drive.hwmap.Init();
        } catch (Exception e) {
            telemetry.addData("[Error]", e.getCause());
            telemetry.update();
        }
    }

    @Override
    public void loop() {

        if (!gamepad1.b) {
            drive.UnSafeBaseDrive(-1,1,1,-1);
        }

        if (gamepad1.b) {
            drive.UnSafeBaseDrive(1,-1,-1,1);
        }
    }
}
