package Clothes;

public enum ClothesDescription {
    BOOTS{
        @Override
        public String description(){
            return "Ботинки.\nНе только красивый аксессуар, но и необходимая вещь в бою.\n" +
                    "Защищают ноги от летящих в игрока снарядов. Поглощают большую часть урона от взрыва бомбы.";
        }
    },
    LEGARMOR{
        @Override
        public String description(){
            return "Поножи.\nДержат ноги в тепле и в безопасности.\n" +
                    "Как ты дойдешь до финала, если ноги будут переломаны?";
        }
    },
    BODYARMOR{
        @Override
        public String description(){
            return "Доспех.\nОсновная часть защиты, легкая, но необходимая в бою.";
        }
    },
    HELMET{
        @Override
        public String description(){
            return "Шлем.\nНужно держать свою голову в безопасности.\n" +
                    "Как ты будешь сражаться, если тебя вырубят первым же ударом в голову?";
        }
    },
    SHIELD{
        @Override
        public String description(){
            return "Щит.\nПочти непробиваемая защита, спасет от чего-угодно";
        }
    };

    public abstract String description();
}
