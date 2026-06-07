public class PausedState implements State {
    @Override
    public void play(MediaPlayer player) {
        if (!player.hasTracks()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Resumed: " + player.getCurrentTrack());
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        if (!player.hasTracks()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Player is already paused: " + player.getCurrentTrack());
    }

    @Override
    public void next(MediaPlayer player) {
        if (!player.hasTracks()) {
            System.out.println("Playlist is empty.");
            return;
        }

        if (player.isLastTrack()) {
            System.out.println("Already selected the last track: " + player.getCurrentTrack());
            return;
        }

        player.nextTrack();
        System.out.println("Paused on next track: " + player.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer player) {
        if (!player.hasTracks()) {
            System.out.println("Playlist is empty.");
            return;
        }

        if (player.isFirstTrack()) {
            System.out.println("Already selected the first track: " + player.getCurrentTrack());
            return;
        }

        player.prevTrack();
        System.out.println("Paused on previous track: " + player.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopped.");
        player.setState(new StoppedState());
    }
}
