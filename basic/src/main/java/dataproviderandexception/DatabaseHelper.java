package dataproviderandexception;

public class DatabaseHelper {
    public String[] splitSQLCommands(String sqlFileContents) {
        String[] statements = null;
        if (sqlFileContents != null) {
            // Change embedded "-- BREAK" instances into / instances
            String sqlFileContents2 = sqlFileContents.replaceAll("[\\n\\r][\t ]*--(\\s*)(?i)BREAK[\t ]*[\\n\\r]", "\n/\n");
            // Change eol "-- BREAK" instance into / instance
            String sqlFileContents3 = sqlFileContents2.replaceAll("[\\n\\r][\t ]*--(\\s*)(?i)BREAK$", "\n/\n");
            // Change multiple / instances into one /
            String sqlFileContents4 = sqlFileContents3.replaceAll("[\\n\\r][\t ]*/[\t ]*[\\n\\r]*[\t ]*/[\t ]*[\\n\\r]", "\n/\n");
            // Split by / on lines by itself
            statements = sqlFileContents4.split("[\\n\\r]+[\t ]*/[\t ]*[\\n\\r]+");

            for (int i = 0; i < statements.length; i++) {
                statements[i] = statements[i].trim().replace("\r\n", "\n");
                if (statements[i].endsWith(";")) {
                    // Remove all newlines
                    String s2 = statements[i].replaceAll("[\\n\\r]", "");

                    // Do not strip trailing semicolon if it is attached to an end command
                    if (!s2.matches("^.*[\\s;]+(?i)(end)\\s*\\w*\\s*;\\s*$")) {
                        statements[i] = statements[i].substring(0, statements[i].length() - 1);
                    }
                }
            }
        }
        return statements;
    }
}
