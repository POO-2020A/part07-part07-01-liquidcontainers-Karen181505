
public class Containers {

    private int first;
    private int second;

    public Containers() {
        first = 0;
        second = 0;
    }

    public int addAmount(int value) {
        if(value<0){
            return this.first;
        }
        this.first = this.first + value;
        if (this.first > 100) {
            this.first =100;
            return first;
        } else {
            return this.first;
        }
    }

    public int moveAmount(int value) {
        if(value<0){
            return this.second;
        }
        if(this.first >= value){
            
            this.first = this.first - value;
            this.second = this.second + value;
            if(this.second >= 100){
                return this.second = 100;
            }
            
        } else {
            this.second = this.second + this.first;
            if(this.second >= 100){
                return this.second= 100;
            }
            this.first = 0;
            
        }
        return this.second;
    }
    
    public int removeAmount(int value){
        if(value < 0){
            return this.second;
        }
        if(this.second < value){
            this.second = 0;
        }
        this.second = this.second - value;
        if(this.second < 0){
            return this.second = 0;
        }
        
        return this.second;
    }
    
    public String toString(){
        return "First: " + this.first + "/100 \n" 
                +"Second: " + this.second + "/100";
    }

}
