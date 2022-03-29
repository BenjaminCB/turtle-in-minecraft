public class CountIf extends timcBaseListener {
    private int count = 0;

	@Override
    public void enterControl_structure(timcParser.Control_structureContext ctx) {
        count += 1;
        System.out.println(count);
    }
}
