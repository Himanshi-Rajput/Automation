package test.testcase1;

import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class ScreenRecording {

   static ScreenRecorder sr;
   static String filename = "./ExecutionRecording";

   public static void startRecording () throws IOException, AWTException
   {
      GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
      Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
      Rectangle rect = new Rectangle(size.width , size.height);

      File file = new File(filename);

      sr = new ScreenRecorder(gc, rect,
              new Format(MediaTypeKey, FormatKeys.MediaType.FILE, MimeTypeKey, MIME_AVI),
              new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                      CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
                      Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
              new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
              null, file);
      sr.start();
   }

   public static void stopRecording() throws IOException {
      sr.stop();
   }

}
