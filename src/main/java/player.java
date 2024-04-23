public class player {
        private String name;
        private symbol symbol;
        private playerType playerType;

        public player(String name, symbol symbol, playerType playerType) {
            this.name = name;
            this.symbol = symbol;
            this.playerType = playerType;
        }

        public String getName() {
            return name;
        }

        public symbol getSymbol() {
            return symbol;
        }

        public playerType getPlayerType() {
            return playerType;
        }
}
