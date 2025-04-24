package oop1;

public class MusicPlayer2 {

    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();

        //음악 플레이어 켜기
        player.on();

        //볼륨 증가
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();

        player.showStatus();

        //음악 플에이어 끄기
        player.off();
    }
}
