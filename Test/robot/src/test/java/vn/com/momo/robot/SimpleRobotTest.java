package vn.com.momo.robot;

import static org.junit.Assert.assertTrue;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import org.junit.Test;
import vn.com.momo.robot.arm.Arm;
import vn.com.momo.robot.arm.FireArm;
import vn.com.momo.robot.arm.LaserArm;


@Module
class LeftFireArmRightLaserArmModule {

  // A provider to attach a left FireArm to the robot.
  @Provides
  @Named("left")
  Arm provideLeftArm(FireArm fireArm) {
    return fireArm;
  }

  // TODO: Add a provider to attach a right LaserArm to the robot.

}

/**
 * A unit test for testing dependency injection.
 *
 * Run your unit test with this maven command:
 * mvn test
 */
public class SimpleRobotTest {

  @Component(modules = {LeftFireArmRightLaserArmModule.class})
  interface LeftFireArmRightLaserArmComponent {
    SimpleRobot getRobot();
  }

  @Test
  public void testLeftFireArmRightLaserArm() {
    LeftFireArmRightLaserArmComponent component =
        DaggerSimpleRobotTest_LeftFireArmRightLaserArmComponent.create();
    SimpleRobot robot = component.getRobot();
    assertTrue(robot.getLeftArm() instanceof FireArm);
    assertTrue(robot.getRightArm() instanceof LaserArm);
  }
}
