package com.example.revisao.views.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.revisao.R;
import com.example.revisao.views.adpaters.MusicAdapter;
import com.example.revisao.views.interfaces.RecycleViewOnClick;
import com.example.revisao.views.model.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaMusicaFragment extends Fragment implements RecycleViewOnClick {

    private RecyclerView recyclerViewMusic;
    private MusicAdapter adapter;
    private List<Music> listaMusic = new ArrayList<>();
    public static final String MUSIC = "music";


    public ListaMusicaFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_musica, container, false);

        recyclerViewMusic = view.findViewById(R.id.lista_recycler);

        adapter = new MusicAdapter(retornaLista(),this);

        recyclerViewMusic.setAdapter(adapter);

        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getActivity()));
        // Inflate the layout for this fragment

        return view;
    }

    @Override
    public void onClick(Music music) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(MUSIC, music);

        Fragment fragmentD = new DetalheMusicFragment();
        fragmentD.setArguments(bundle);

        replaceFragment(fragmentD);


    }

    private void replaceFragment(Fragment fragmentD) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragmentD);
        transaction.commit();

    }


    public List<Music> retornaLista(){
        listaMusic.add(new Music("Mr. Brightside", "Coming out of my cage\n" +
                "And I've been doing just fine\n" +
                "Gotta gotta be down\n" +
                "Because I want it all\n" +
                "It started out with a kiss\n" +
                "How did it end up like this?\n" +
                "It was only a kiss, it was only a kiss\n" +
                "Now I'm falling asleep\n" +
                "And she's calling a cab\n" +
                "While he's having a smoke\n" +
                "And she's taking a drag\n" +
                "Now they're going to bed\n" +
                "And my stomach is sick\n" +
                "And it's all in my head\n" +
                "But she's touching his chest now\n" +
                "He takes off her dress now\n" +
                "Let me go\n" +
                "And I just can't look, it's killing me\n" +
                "And taking control"));
        listaMusic.add(new Music("Read My Mind", "On the corner of main street\n" +
                "Just tryin' to keep it in line\n" +
                "You say you wanna move on, and\n" +
                "You say I'm falling behind\n" +
                "Can you read my mind?\n" +
                "Can you read my mind?\n" +
                "I never really gave up on\n" +
                "Breakin' out of this two-star town\n" +
                "I got the green light\n" +
                "I got a little fight\n" +
                "I'm gonna turn this thing around\n" +
                "Can you read my mind?\n" +
                "Can you read my mind?\n" +
                "The good old days, the honest man\n" +
                "The restless heart, the Promised Land\n" +
                "A subtle kiss that no one sees\n" +
                "A broken wrist and a big trapeze"));
        listaMusic.add(new Music("Smile Like You Mean It", "Save some face, you know you've only got one\n" +
                "Change your ways while you're young\n" +
                "Boy, one day you'll be a man\n" +
                "Oh girl, he'll help you understand\n" +
                "Smile like you mean it\n" +
                "Smile like you mean it\n" +
                "Looking back at sunsets on the East side\n" +
                "We lost track of the time\n" +
                "Dreams aren't what they used to be\n" +
                "Some things sat by so carelessly\n" +
                "Smile like you mean it\n" +
                "Smile like you mean it"));
        listaMusic.add(new Music("Somebody Told Me", "Breaking my back just to know your name\n" +
                "Seventeen tracks and I've had it with this game\n" +
                "I'm breaking my back just to know your name\n" +
                "But heaven ain't close in a place like this\n" +
                "Anything goes but don't blink, you might miss\n" +
                "Cause heaven ain't close in a place like this\n" +
                "I said heaven ain't close in a place like this\n" +
                "Bring it back down, bring it back down tonight\n" +
                "Never thought I'd let a rumor ruin my moonlight\n" +
                "Well, somebody told me you had a boyfriend\n" +
                "Who looked like a girlfriend\n" +
                "That I had in February of last year\n" +
                "It's not confidential\n" +
                "I've got potential\n" +
                "Ready, let's roll onto something new\n" +
                "Taking its toll, and I'm leaving without you\n" +
                "Cause heaven ain't close in a place like this\n" +
                "I said heaven ain't close in a place like this\n" +
                "Bring it…"));
        listaMusic.add(new Music("Human", "I did my best to notice\n" +
                "When the call came down the line\n" +
                "Up to the platform of surrender\n" +
                "I was broad but I was kind\n" +
                "And sometimes I get nervous\n" +
                "When I see an open door\n" +
                "Close your eyes\n" +
                "Clear your heart\n" +
                "Cut the cord\n" +
                "Are we human?\n" +
                "Or are we dancer?\n" +
                "My sign is vital\n" +
                "My hands are cold\n" +
                "And I'm on my knees\n" +
                "Looking for the answer\n" +
                "Are we human?\n" +
                "Or are we dancer?\n" +
                "Pay my respects to grace and virtue\n" +
                "Send my condolences to good\n" +
                "Give my regards to soul and romance\n" +
                "They always did the best they could\n" +
                "And so long to devotion\n" +
                "You taught me everything I know\n" +
                "Wave goodbye\n" +
                "Wish me well\n" +
                "You got to let me go\n" +
                "Are we human?\n" +
                "Or are we dancer?\n" +
                "My sign is vital\n" +
                "My hands are cold\n" +
                "And I'm on my knees\n" +
                "Looking for the answer\n" +
                "Are we human?\n" +
                "Or are we dancer?"));
        listaMusic.add(new Music("Miss Atomic Bomb", "You were standing with your girlfriends in the street\n" +
                "Falling back on forever, I wonder what you came to be\n" +
                "I was new in town, the boy with the eager eyes\n" +
                "I never was a quitter, oblivious to schoolgirls' lies\n" +
                "When I look back on those neon lights\n" +
                "The leather seats, the passage rite\n" +
                "I feel the heat, I see the light\n" +
                "Miss Atomic Bomb\n" +
                "Making out, we've got the radio on\n" +
                "You're gonna miss me when I'm gone\n" +
                "You're gonna miss me when I'm gone\n" +
                "Racing shadows under moonlight\n" +
                "Through the desert on a hot night\n" +
                "And for a second there we'd won\n" +
                "Yeah, we were innocent and young\n" +
                "Cast out of the night, well you've got a foolish heart\n" +
                "So you took your place but the fall from grace was the hardest part\n" +
                "It feels just like a dagger buried deep in your back\n" +
                "You run…"));
        listaMusic.add(new Music("Shot At The Night", "Once in a lifetime, the suffering of fools\n" +
                "To find our way home, to break in these palms\n" +
                "Once in a lifetime (Once in a lifetime)\n" +
                "Once in a lifetime\n" +
                "Give me a shot at the night\n" +
                "Give me a moment, some kinda mysterious\n" +
                "Give me a shot at the night\n" +
                "Give me a moment, some kinda mysterious\n" +
                "Once in a lifetime, the breaking of the roof\n" +
                "To find that our home, has long been out grown\n" +
                "Draw me a life line, 'cause honey I got nothing to lose\n" +
                "Once in a lifetime (Once in a lifetime)\n" +
                "Once in a lifetime\n" +
                "Give me a shot at the night\n" +
                "Give me a moment, some kinda mysterious\n" +
                "Give me a shot at the night\n" +
                "Give me a moment, some kinda mysterious\n" +
                "Give me a shot at the night\n" +
                "Look at my reflection in the mirror\n" +
                "Underneath the power of the light\n" +
                "Give me a shot at the night\n" +
                "Give me…\n"
                ));
        listaMusic.add(new Music("When You Were Young", "You sit there in your heartache\n" +
                "Waiting on some beautiful boy to\n" +
                "To save your from your old ways\n" +
                "You play forgiveness\n" +
                "Watch it now, here he comes\n" +
                "He doesn't look a thing like Jesus\n" +
                "But he talks like a gentlemen\n" +
                "Like you imagined when you were young\n" +
                "Can we climb this mountain\n" +
                "I don't know\n" +
                "Higher now than ever before\n" +
                "I know we can make it if we take it slow\n" +
                "Let's take it easy\n" +
                "Easy now, watch it go\n" +
                "We're burning down the highway skyline\n" +
                "On the back of a hurricane that started turning\n" +
                "When you were young\n" +
                "When you were young\n" +
                "And sometimes you close your eyes\n" +
                "And see the place where you used to live\n" +
                "When you were young\n" +
                "They say the devil's water, it ain't so sweet\n" +
                "You don't have to drink right now\n" +
                "But you can dip your feet\n" +
                "Every once in a little while"));
        listaMusic.add(new Music("Spaceman", "It started with a low light\n" +
                "Next thing I knew they ripped me from my bed\n" +
                "And then they took my blood type\n" +
                "It left a strange impression in my head\n" +
                "You know that I was hoping\n" +
                "That I could leave this star-crossed world behind\n" +
                "But when they cut me open,\n" +
                "I guess that changed my mind\n" +
                "And you know I might\n" +
                "Have just flown too far from the floor this time\n" +
                "'Cause they calling me by my name\n" +
                "And the zipping white light beams\n" +
                "Disregards the bombs and satellites\n" +
                "That was the turning point\n" +
                "That was one lonely night\n" +
                "The star maker says, it ain't so bad\n" +
                "The dream maker's going make you mad\n" +
                "The spaceman says, everybody look down\n" +
                "It's all in your mind\n" +
                "Well now I'm back at home, and\n" +
                "I'm looking forward to this life I live\n" +
                "You know its gonna haunt me"));

        return listaMusic;

    }
}


