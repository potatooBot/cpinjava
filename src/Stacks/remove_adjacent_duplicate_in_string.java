//You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
//
//        We repeatedly make duplicate removals on s until we no longer can.
//
//        Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
//
//
//
//        Example 1:
//
//        Input: s = "abbaca"
//        Output: "ca"
//        Explanation:
//        For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
//        Example 2:
//
//        Input: s = "azxxzy"
//        Output: "ay"

package Stacks;

import java.util.Stack;

public class remove_adjacent_duplicate_in_string {
    public static void removeDuplicates(String s) {
        Stack <Character> stk=new Stack<>();
//stk.push(s.charAt(0));
        int k=0;
       while(k!=s.length()){
//           System.out.println(s.charAt(k));
//           System.out.println(k);
           if(stk.isEmpty()){
//               System.out.println("emoty");
               stk.push(s.charAt(k));
k++;
           continue;}
               if (stk.peek() == s.charAt(k)) {

//                   System.out.println("matched");
                   stk.pop();
                   System.out.println(stk);
                   k++;
               }

               else {
                   stk.push(s.charAt(k));
                   k++;
                   System.out.println(stk);

               }

       }
       String str="";
       char ch;
       while (!stk.isEmpty()){
            ch=stk.pop();
           str=ch+str;
       }
        System.out.println(str);
    }
    public static void main(String[] args) {
//        String s = "abbaca";
//        String s = "aaaaaaaa";
        String s = "cjpgjsomosejmrphpsirmhrhestdcigpbpfkhrgptjelkjrqqogcoabkntfdodoegtgbeidsonksnaegofrqndhlepfnjnjbfoqmhbecjsmnjqijplarpjetttcdmaeeottljcgskjigtcocalctttdqtslpjdglqqnndqicjsehblbqicqdjlfqpbfgoslrtjjakacttignfjklqpofjdjoeqficrmljhdkjrbqeimecceamgemljapkcbejeqhqgkeqoajenmdeehstjlbqpqcjtgallepbnajtbegcitpprebcbaqoimpiiigqkhppeltkeempqfamtcnbjgrhpkgtbpdfrnrtaambbeohocsfaohtleqoosemrdliallfnifjdnqjbjbekdcnhgediairamjdhaaegrgejchsoaaetootohslmfoodnkjonefiigqjicnjkqjbniqdjcqmacrcagcfbiqsjlagcjtjordchcflkaelkniehboibdamtpmeiqqospkbnpgktirjgopoetsmqjoiqtflheermfpgjmchmfjgbkapnhqhotjqplrhgmkcjraihdksrelgshfetcostililosmcqternhjkcoaortjbpcnselcnegfcfhfsncleghmkmjblacdtrnqkrpbrpgsoemqhbeiktajigqqqmselcqetqomjoqmmdnapgrtdcgqlccofsnmgatdjdaaaamgeckgrmihpjsbidrcfooptfprqeklpfkrkqpepnpjsjkabrkjkqnnojethaohbnnrgsrhfplmtjqnjnikoeggqogrikkolrsbaethdktrqhlaogfcprfomkqcjqngemekesmqsifipbtneqsapipfpmpslepbqsjlkedknprpraiahatrhrodejtlldjneekarnjjngnfkidnamdrhqinhdpshjrqpncsdolcnfhatngipkskteenniebqjnecntrgtchsrdmgsdbocotttsifebmorpqmfcmqemjlnhcpbbiacjctpctmftkntjmrpkmpitranbcmaqssqapgabinrcaeigpcjiqeqkncbfhalibgdseginqnlccjhstshijdafsagnfhaboqmigfneeddkodocdnhgdiiiftpdrijpoojslffrspkgdfhqlqdnbtqimkqddjpphdmphejqaotmhndodpkjptlpnfctsmkekabrfpifelgckjsplfbaggkhgrebtkksqdsnskbqismrfghpssoqfprlrbkfrtsrdqfoffpkcqeiamqckdlbjnitrsjqrtqjbnrsladreqcaopdqkpijocotrhlgosokqnljtljlrdsbttrkkgtshqeihqstfmqrsrjrcknteqnsqijkprsinaoescbkrnabrdrmlbgblarijkfcptqftsqrfafetnerpttshdngbcjlratfdfnhroogolfqhpopdibnggsqssgcfeaphcksfqtdikniqfipmcbhdqfnkbokeiqepssemmaaprjbkrktqosessnpisitdcpbpsflbsjjpjggcboacpanaeqmkbaibimqicahbbkpqnljelclsfmkbgmdlhpotlahqmogtpoargqhdqtpdnrpmicatqanqtlrmkprjklkehcllafidklpnsbqchpajejcjeppdhlaibassdmcjbtdkipraemmbofgbnpskhgkjdoqffhjbjlhescbrlafnjrbfbspnmkelnijgohkptognttpjfosjnlqcficjdjpdmtqrfillcjbfjsliggaqnigkajsginnthcrnmsgfgkdtcsbsbjdktpohtgmddimmgnslnmsnqtsqqjjdgssejostaklamslggqntgmldhphafbeafjccrpfaojaccncrsqdhnijlihrfsdellgstntijpqdjhdrbhqtslbifrrcspsprikpicknrpsaabnnlmrkkigbbneljmqqchabaipocctciodercbmpmjdhcipsfddhqmmehdgtrigiqfqqecmklefiighooeegalttlpitatdnqkhfctdhrafktjtbohmekalsqmcqrskschhcfjrfsrgkmjtcdmrcollmrjqntnhmkamimgjancrapccfpcjoriaoqnqolgjomniaaeinirablfammopsomsldleophbfakmqqpbqnandantiimhmokqimqgpdhlnckbkenoigedmsontmanoikinfmmmghdfsscqfmjgbenkcrljifrgbipbdobrabenhotacpcrpcgcefenarqcenaiomnkflskpgiratckmepndgrmqkarberpsaflcrlmijrgksbmilrntmcnmbtsrgpcpppapbrotaofmchehpnqreoberedlrfejajbhjmqetabpphfbdjrarkmdepdllqrarrskqkapsfrkdsebrhlqtgftijjclihiqjljsbpmfltgqpbbdkeshrackmlaoitmoibdinlhtnokbqteoskbpaocjkihhfqsdpsibmeajdgsdoorkaloghgrtbanclhitalfjmrhlkttaatjokginrfqsphopfldnnqfjbtejaiakikqhodiklttttfjlqntgqsfimnsstpojlopjlcadehkgnkkjameotdmobilmctmhetembottcsjtgbgbmkcnbqtlqenfjipcmtimqfchlpqjqmqtbdbskgfqmibkqocjdlciesarpttgntnioibhtpcismtgpnbengmnbboelrriqqqhnqockjphkntlgrrmjnndqkgidgihjmjqimmlbgpbtlnlohjmhlesmflklfcrqhbepmceticlcfrhsjrqnbpgqosjkdfqbfpcddnmqjjakllgjmgjjcakpfgfrhpffcagakkoitqiaglsfatjiirlsgaddcjekolioehllqjmagqfgbjojhinkbhjrlpfgoqnmfjofstlkkqesilmrekqqoprhdjmeeaqddardadrjtrtopobmctlkorpjcdaqjljopekajldjeqkttnpfkhtghabkpjkosdbkmrkalcdecoqmbirrmcmtsbntoospfogplhntjbtiqjcjpamqppcfdpcdqqdrhehbljprkhdslsmsomhndarepsndbjlsnantsnhkabrjgrgdhjobohmjmlmdidarjsgoisdpgohgscmnqgfeboqkhfbckqhsjtjrkdfkmoefdmnottjfgljnfrejgnhrlcgfhrfroonjqbkegjmnnihbqoteagogbdfkmebhmsehratsdtfpjtfsgiegktkcflttrnlicidphaqejorntreajegmniaprbtbnsrnagsicsmghboqkkeidjkoqfatisbmeeiasalqbhqrdeltlkrqciktfcsbbfkmtgttebmmefjheeiisqtgaeimaonjclrmssfrkfekqbicrmserkbfpbmncdkqstkiedfoqmhgjtafintdldarneancdjaffkssmeckqsmolpiicsikgagbfkbfmotccdqdlorbcehejgdjpaqgrjmkgfnlabptjpcqkotlebmoqnghrtgeokiknjmhqbspdgcqgcbrjsdjsakfhcpmkbrmctlnidhstgcimaopgktefhbjcntbjmkqescsedoirfcdofbconjmdfbsnmjihmbslomkefmbcktgbfmqjhrbctrafilaamrbiioeiitjbsnnjplomngjafjpfmgbeclhktprafbqsmedfqibpsjdpgrpnfbnhqrtjlnelingkilmdbetqonnamomgjkbiprjkacohjdpfclnglaocfattnsltosqbdnrftgkomhdgsisfjlqkmtsqchsalqpnlhhaksbrqjobrrsgrftconsshiccbfnpesdsaokrsgnlsprhjcfrhqcdtrlmpjaahcfqggoqoiclormbtkmqirdgtkbdflaijericrfhirgjabtedglcelmcdprgtiolroefharklifcqqrmdijilegfdrnskenkfkaabcrfmnmfgjtrfoirgnmjdtogjcckthoenqpptifhkselotdrtrplcmjsetjgbbcccohseoftfebkgdbjqoctgcqllhbfpqnfqdsjprffssjoncqirrknjrqmdrsttmrnheaptlhgsjbosjhdijgfphsshkgppcdlijeonlbnpfaqlgknddhlkbeihkcheeeokcdmjrrtdclkohjcrliliaakqiebkmgpjomspbnpjlcrldqppqgiopennbicnforcnamttdkonmgqotdtpfairoqoibgnlbmmnooimrhfhbdhektlqmbgnnedhqnfkfrtepehcjkcgsnbrjslgtjdimifaqdgtqalcgcqlbafodesneafcpcftbqptgieaqhbrqakkmmlopmsrpctmanghdjrroaktpqehmbllostddmrecmapnooobgmkptslqhqeptntsdnrocosjmmqhjlsnelcrqseohocrmnmstrpemstqaapfspsogkmrbdohiqhnspebmqcpmjdhappifesiqbngeqbchrhhpgjlnrceissglfbdkdtklnqntdcgtgmmearadrksklrsftnheplkljgcicljijpmfptlmohdekdflasdfdihcndqqkgsdndkkapodojtpeqeembmdgrjogpadpkbpogopokifqllhniiqlcbajrqlornbbpgnebgmdcjbbskemppasqdkqteelrpchfrqmmpbjffepkrconkhaesgkqfjfressnbfbcpfnoifekmilpkcfnnifnploljmkjmlhqkctntmatoedpriramidlcjemfgppbcprtksgegfalecdncrfegfflthlfsacepqthcinqonhaspcmtqifklcakjfmghkfjcpclhttnhffileatcqklemscegeiopfekaodegnkmbrdcrqtqkatcdjjpjnrkcsnkqghoegssfbhacdcfrcbtnnfohebkrreqmmhpqdlpkinnnpbrcaqlhhckmiqeggiqlqtrcoitpgdmmppfbefacnhchsgomnficlsnsekqcrjkskapchejbeqsjcprkklcnfgtnodqihrltcrjaeojarocgphbtglnergonshgmqkptkjphjnbhsahrobrmhfgkdjimgnkqbdjlsfhjskesrdiholpgsddpbidnqjjfnscrcalimqikqoketljoqekfqimqomscnbchrkkncnhbbblholahtfhckdpbofjmaobibibtfqsfsrnjtjpnbeedpstqoedlldtajjkpjijbjnlcfciaanhlkrnsagdtkfttjsdjnhenessbbonqjtthmignckbhmmcfjsimnphjndilordjjgbtalthdjfpreahfbdrcnbgpmthnlsqdclsdghdkciflnbpnikeakhsnkdkcqsaofdfnmqbnobtloqlrgmacqrlnmkmapoeimbmrdintembpbdgcincfmkmgdkjtsdstntspbfilejndfmignggagmfisseqtjsnplmmadedtnrcniboogtijngtrogseeonpaktkidgetrfkcokbnoahgdkrtggplthigdjeoimipdtrijknihjdcrpsijejqcgsgikkshfggfjaaettkrkehkbcflhhjcectmjmeersdlcahkpclbealemldeehktaqjndceeerkptrqldplkcrhcmbrhksfbkojblinjcothmlrtqetcfilibddfklaqskcagjjjtotdmcicaqclnrpkdjjnpejiqeepltkhtmfmlrkrfierfrsfcimabigkihtcsrqhgansogdpfpjjrondsdtogkhfohqrbobnqternmhtgoopkaasigssiqkrgbjhghpjjijmlsnhgikpmrlnoonnpmfsaajrrrlmfqeiefcglffioarmrpbdamriajjodkbebobjrskblkqleqetfhfhkkslcdtlptfthcbcodboeokdihkggicggpaegckaoqsqejtmsfltnntjppegfosaltkjqtcbabklbshggalsbaartojseipaccbiafabifdmicojjmofkhdgaotfmcmdpanatbdbkocekiljmealtnskgembgrobracbdctmhhgrmqocgsrjiofotmjfaidfneeariehdpfrqhhdanenmcgjgocgaajmcoolcahorlrtmfpikacenodnbcksqeqcainainlajqhhsmrldmphoolhqqohgakkfefbeaqkbaobaorclgdfprlcmdlimnrbktomhapekqqfidmclqccmdbtentemgepbkpihnpflitaegikshdorjdgfeksaqitklskoqesnqaakhtdnptrkcbshgchgcesnljicagdledtqhfjaqkmlsrafffqrqadqkeinssptlqijjqtscmsmgnqakmkileaglbmjjpdbdcdmnccarmsfbqjdjphroqgneosefbpgdkipqosraqssmcaggrjtcjebqqbbtjsfkqibkrkkrojdgqjtnedscgaholjdknbhnqngfodossabdnpdosrocqldittilqeijgjkeffkjgbkmjdrjmikhraqaerdjhcterdmekpnqajlnbrorfsqjpfkhrfajiqalopkdsgeioreeieridfpckpkjpbocggakfnlrmgcjkacpgjmmqtleqnmcsdhebtpnnkhemgateclkhppsjoelprtgnpgeraaaqassodrokhmmmddlkggcsqabgptfliekirqtdfogkqcjindndrbbbrchpashkncncqnkcdddnttspjijpibnnrotfldtobptcbbdlgpedcjknsoldicnbqtdatsbiqocienlpcghaqsrdreldpnfnrgclhthpleatndsjsnktjaeifkndtiogfstefsdhgagqjicjpikjfbtqqoaktmqgemdfftbfnhrpkaftacigqtjmlfokqffhfhsprkqtdiheslhmoeggofstrfnbqdhjnqabodatfifgmkkdrrrbmkcbegteihkcqtrnncorchgcqlfijobonecpbhccrljejprbjebtpqmaotjqfkkofssdpftjgqqljaqsolgpidsqllqrgctjilalddsllpenmdgiaiieqflsffsklfcdsfdtjshrekqebapktldhqofbopcebigphpabjcslfhbhfokkqbesirsojpajecogmfnhcrlelqccerfcjeoeeharsgfipqiqplgaigkoqdpsbdgdencgtlborreneconcjfjrldlccnfrfoiarhjbgsekdriitjjalbqhanqqddsacnpfkfcqppngtfckhflnrpdlccakekkbthghkrmkpehtlagqtsegtfkifinetbpblqsddsqdfbltrimthqabbdldmijppemdtehplnafoninpdrccthqlqeepcjbpqfnkhenrrogbkirqnmoahioraeomhjebepmobdqepccdlbhejnlktmctatkmrilebehljgiofcpedmeshbeafddbpcineqkmspicrobrcehphjoiegkfhjgtreddohrierelhdpthtgiallfpdnodgmgpjqfssagbqkrjetdcpcqidsjrnashjkeikgqenerqpaingljhrbligdmfnecidksbstahphfoghnmjfirepamroshejooecibrjpnnlknboqgrqgqmntqpmhanoafijhbdaaattifbpaloecfchjqdldtjihndlrenjrfnppjfhshlgiprrgdabkrpkfoericsekmllpfobjfjqatronhlninlcsqeboesbejaimokokhimgdgdtcalfpbctcpbeffdpanespdkiaaikondtoctnagcignmprqtobcjriaampnoikaeofcbipipmkbkgnsqnmhcogkfnkcbepcdeibccbcnheqpmftebfmphfajidingbetdhbqifjehccpptaqclqirdsmitptgnmsctcjqdtpbfdprbihpaqbmdibkolrqhjnhbgqtmdtdjkjipdlbcedrchakqtrjfppcatjflrtbknlpag";
        removeDuplicates(s);
    }
}
