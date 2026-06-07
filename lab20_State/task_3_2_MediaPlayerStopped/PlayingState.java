public class PlayingState implements State {
    @Override
    public void play(MediaPlayer player) {
        if (!player.hasTracks()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Player is already playing: " + player.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Paused: " + player.getCurrentTrack());
        player.setState(new PausedState());
    }

    @Override
    public void next(MediaPlayer player) {
        if (!player.hasTracks()) {
            System.out.println("Playlist is empty.");
            return;
        }

        if (player.isLastTrack()) {
            System.out.println("Already playing the last track: " + player.getCurrentTrack());
            return;
        }

        player.nextTrack();
        System.out.println("Playing: " + player.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer player) {
        if (!player.hasTracks()) {
            System.out.println("Playlist is empty.");
            return;
        }

        if (player.isFirstTrack()) {
            System.out.println("Already playing the first track: " + player.getCurrentTrack());
            return;
        }

        player.prevTrack();
        System.out.println("Playing: " + player.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopped.");
        player.setState(new StoppedState());
    }
}
