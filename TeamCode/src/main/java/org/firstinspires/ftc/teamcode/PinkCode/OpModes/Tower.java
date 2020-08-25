package org.firstinspires.ftc.teamcode.PinkCode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.PinkCode.Subsystems.DriveSystem;

@TeleOp(name = "Slides", group = "Telop")
public class Tower extends OpMode {

    private DriveSystem drive;
    private Boolean encoder = true;

    @Override
    public void init() {
        drive = new DriveSystem(hardwareMap, telemetry);
    }

    @Override
    public void loop() {
        try {
//            if (gamepad1.a) {
//                try {
//                    telemetry.addData("Motor Right Pos", drive.hwmap.dcMotor_tower_right.getCurrentPosition());
//                    telemetry.addData("Motor Left Pos", drive.hwmap.dcMotor_tower_left.getCurrentPosition());
//                    telemetry.addData("Motor Right Power", drive.hwmap.dcMotor_tower_right.getPowerFloat());
//                    telemetry.addData("Motor Left Power", drive.hwmap.dcMotor_tower_left.getPowerFloat());
//                    telemetry.update();
//                } catch (Exception e) {
//                    telemetry.addData("ERROR", e.getMessage());
//                    telemetry.update();
//                }
//            }

            drive.SafeTowerDrive(gamepad1.left_stick_y, encoder);
        } catch (Exception e) {
            telemetry.addData("err", e.getCause());
            telemetry.addData("err", e.getMessage());
            telemetry.update();
        }
    }
}
