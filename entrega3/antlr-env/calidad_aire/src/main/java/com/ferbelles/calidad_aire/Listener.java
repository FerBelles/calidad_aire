package com.ferbelles.calidad_aire;

public class Listener extends calidad_aireBaseListener {
    private int resConjunto = 5;
    private String resString ="";

    int[] rangesPm10 = {0, 55, 155, 255, 355};
    int[] rangesPm25 = {0, 13, 38, 56, 151};
    int[] rangesO3 = {0, 107, 139, 168, 208};
    int[] rangesSO2 = {0, 94, 198, 487, 798};
    int[] rangesNO2 = {0, 101, 190, 678, 1222};
    int[] rangesCO = {0, 5094, 10820, 14255, 17688};

    @Override
    public void exitPm10(calidad_aireParser.Pm10Context ctx){

        int res10 = getCalidad(Integer.parseInt(ctx.INT().getText()), rangesPm10);
        if(res10 < resConjunto){
            newRes(res10);
        }
    }

    @Override
    public void exitPm25(calidad_aireParser.Pm25Context ctx){

        int res25 = getCalidad(Integer.parseInt(ctx.INT().getText()), rangesPm25);
        if(res25 < resConjunto){
            newRes(res25);
        }
    }

    @Override
    public void exitO3(calidad_aireParser.O3Context ctx){

        int resO3 = getCalidad(Integer.parseInt(ctx.INT().getText()), rangesO3);
        if(resO3 < resConjunto){
            newRes(resO3);
        }
    }

    @Override 
    public void exitSo2(calidad_aireParser.So2Context ctx){

        int resSo2 = getCalidad(Integer.parseInt(ctx.INT().getText()), rangesSO2);
        if(resSo2 < resConjunto){
            newRes(resSo2);
        }
    }

    @Override
    public void exitNo2(calidad_aireParser.No2Context ctx){

        int resNo2 = getCalidad(Integer.parseInt(ctx.INT().getText()), rangesNO2);
        if(resNo2 < resConjunto){
            newRes(resNo2);
        }
    }

    @Override
    public void exitCo(calidad_aireParser.CoContext ctx){

        int resCo = getCalidad(Integer.parseInt(ctx.INT().getText()), rangesCO);
        if(resCo < resConjunto){
            newRes(resCo);
        }
    }
    /* 
    @Override
    public void enterFile(calidad_aireParser.FileContext ctx){
        System.out.println("\"Funciono\"");
    }

    @Override
    public void exitFile(calidad_aireParser.FileContext ctx){
        System.out.println("\"Funciono1\"");
    }
    */
    @Override
    public void exitDatos(calidad_aireParser.DatosContext ctx){
        resString = getResString(resConjunto);
        getResult();
    }

    public int getCalidad(int valor, int[] ranges){
        if (valor >= ranges[0] && valor < ranges[1]){
            return 5;
        }else{
            if(valor >= ranges[1] && valor < ranges[2]){
                return  4;
            }else{
                if(valor >= ranges[2] && valor < ranges[3]){
                    return 3;
                }else{
                    if(valor >= ranges[3] && valor < ranges[4]){
                        return 2;
                    }else{
                        return 1;
                    }
                }
            }
        }

    }

    public void newRes(int valor){
        resConjunto = valor;
        //resString = getResString(valor);
    }

    public String getResString(int valor){
        if(valor == 5){
            resString += "Calidad de aire buena \r\n";
        }else{
            if(valor == 4){
                resString += "Calidad de aire aceptable \r\n";
            }else{
                if(valor == 3){
                    resString += "Calidad de aire mala, se recomienda tomar medidas prventivas \r\n";
                }else{
                    if(valor == 2){
                        resString += "Calidad de aire muy mala, se recomienda tomar medidas de alerta \r\n";                         
                    }else{
                        resString += "Calidad de aire extremadamente mala, se recomeidna tomar medidas de emergencia \r\n";
                    }
                }
            }
        }

        return resString;
    }

    public String getResult(){
        return resString;
    }
    
}
