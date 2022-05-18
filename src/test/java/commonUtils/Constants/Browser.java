package commonUtils.Constants;

public enum Browser {
        CHROME("chrome"),
        FIREFOX("firefox"),
        EDGE("edge"),
        SAFARI("safari"),
        HEADLESS("headless");

        private final String text;

        Browser(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
}
