/**
 * 构建常量
 *
 * @author D.Yang
 * @date 2021/1/7
 */
object Settings {
    const val JAVA_VERSION = "1.8"
    const val UTF_8 = "UTF-8"

    const val UI_DEFAULT_OUTPUT_DIR = "dist"
    const val UI_BUILD_OUTPUT_DIR = "build/resources/main/static"
    val COMMAND_UI_LINT = listOf("run", "lint")
    val COMMAND_UI_BUILD = listOf("run", "build")
}
