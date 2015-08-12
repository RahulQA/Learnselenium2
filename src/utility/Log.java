//package utility;
//
//import org.apache.log4j.Logger;
//
//public class Log {
//
//	private static Logger log = Logger.getLogger(Log.class.getName());
//	
//	public static void startTestCase(String sTestCaseName){
//		 
//		Log.info("****************************************************************************************");
//	 
//		Log.info("****************************************************************************************");
//	 
//		Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
//	 
//		Log.info("****************************************************************************************");
//	 
//		Log.info("****************************************************************************************");
//	}
//		 public static void endTestCase(String sTestCaseName){
//			 
//				Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
//			 
//				Log.info("X");
//			 
//				Log.info("X");
//			 
//				Log.info("X");
//			 
//				Log.info("X");
//			 
//				}
//			 
//				// Need to create these methods, so that they can be called  
//			 
//			 public static void info(String message) {
//			 
//					Log.info("Hey");
//			 
//					}
//			 
//			 public static void warn(String message) {
//			 
//			    Log.warn("Hey");
//			 
//				}
//			 
//			 public static void error(String message) {
//			 
//			    Log.error("Hey");
//			 
//				}
//			 
//			 public static void fatal(String message) {
//			 
//			    Log.fatal("Hey");
//			 
//				}
//			 
//			 public static void debug(String message) {
//			 
//			    Log.debug(message);
//			 
//				}
//			public static Logger getLog() {
//				return log;
//			}
//			public static void setLog(Logger log) {
//				Log.log = log;
//			}
//	
//	}
//	
//	
//
