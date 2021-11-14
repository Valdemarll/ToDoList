import java.util.List;

public class CasesList {
    private List<Case> caseList;

    public List<Case> getCaseList() {
        return caseList;
    }

    CasesList(List<Case> caseList){
        this.caseList = caseList;
    }

    public void addCase(){
        CaseCreater createCase = new CaseCreater();

        String caption = createCase.setNewCaseCaption();
        if (createCase.testUniqueCaption(caption, caseList)){
            Case newCase = createCase.createNewCase(caption,
                    createCase.setNewCaseDescription(),
                    createCase.setNewCaseImportance()
            );
            caseList.add(newCase);
            System.out.println("Успешно!");
        }
    }

    public void removeCase(){
        CaseSearcher searcher = new CaseSearcher();
        try{
            caseList.remove(searcher.findCase(caseList, searcher.input("удалить")));
            System.out.println("Успешно!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого дела в списке нет");
        }
    }

    public void setCaseCompleted(){
        CaseSearcher searcher = new CaseSearcher();
        try{
            searcher.findCase(caseList, searcher.input("отметить как выполненное")).setCompleted(true);
            System.out.println("Успешно!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого дела в списке нет");
        }
    }

    public String toString(List<Case> list){
        String result = "";
        for (Case c : list){
            result += c.toString();
        }
        return result;
    }

    public void uploadList(String fileCaption){
        CasesListUploader uploader = new CasesListUploader();
        String data = uploader.readingText(fileCaption);
        this.caseList = uploader.formattingToList(data);
    }

    public void saveList(String fileCaption){
        CasesListSaver saver = new CasesListSaver();

        saver.createNewFile(fileCaption);
        String formData = saver.formattingToString(caseList);
        saver.fileWriting(formData, fileCaption);
    }
}
