function[Criature,status]=newCriature(varargin)
%%
%newCriature initialize a new criature by reproduction or initialization.
%By reproduction this function can make sexual reproduction and asexual
%reproduction. Sexual reproduction needs two parents instead of asexual
%which only needs one.
%The fucntion 
if nargin>0
    switch nargin
        case 1
            tmp = varargin {1};
            if isstruct(tmp)
                parent = tmp;
                existParam = [0,0,100,100];%position, life, energy
                mutationRate = 0.2*ones(1,3);
                Criature=reprodCriature(parent,parent,mutationRate);
                Criature.position=[existParam(1),existParam(2)];
                Criature.life=existParam(3);
                Criature.energy=existParam(4);
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=1;
                return;
            elseif ismatrix(tmp)&&length(tmp)==4
                existParam=tmp;
                Criature=struct;
                for i=1:4
                    Criature.(strcat("C",num2str(i)))=round(sprand(404,4,1));
                end
                Criature.C5=round(sprand(5,7,1));
                Criature.position=[existParam(1),existParam(2)];
                Criature.life=existParam(3);
                Criature.energy=existParam(4);
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=0;%status
                return;
            end
            
        case 2
            tmp1=varargin{1};
            tmp2=varargin{2};
            if isstruct(tmp1)&&isstruct(tmp2)
                parent1 = tmp1;
                parent2 = tmp2;
                existParam = [0,0,100,100];
                mutationRate = 0.2*ones(1,3);
                Criature=reprodCriature(parent1,parent2,mutationRate);
                Criature.position=[existParam(1),existParam(2)];
                Criature.life=existParam(3);
                Criature.energy=existParam(4);
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=1;
                return;
            elseif isstruct(tmp1)&&ismatrix(tmp2)
                parent1 = tmp1;
                existParam = tmp2;
                mutationRate = 0.2*ones(1,3);
                Criature=reprodCriature(parent1,parent1,mutationRate);
                Criature.position=[existParam(1),existParam(2)];
                Criature.life=existParam(3);
                Criature.energy=existParam(4);
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=1;  
                return;
            else
                Criature=struct;
                for i=1:4
                    Criature.(strcat("C",num2str(i)))=round(sprand(404,4,1));
                end
                Criature.C5=round(sprand(5,7,1));
                Criature.position=[0,0];
                Criature.life=100;
                Criature.energy=100;
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=0;%status
                return;
            end
            
        case 3
            tmp1 = varargin{1};
            tmp2 = varargin{2};
            tmp3 = varargin{3};
            
            if isstruct(tmp1)&&isstruct(tmp2)&&ismatrix(tmp3)&&length(tmp3)==4
                parent1 = tmp1;
                parent2 = tmp2;
                existParam = tmp3;
                mutationRate = 0.2*ones(1,3);
                Criature=reprodCriature(parent1,parent2,mutationRate);
                Criature.position=[existParam(1),existParam(2)];
                Criature.life=existParam(3);
                Criature.energy=existParam(4);
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=1;
                return;
            elseif isstruct(tmp1)&&isstruct(tmp2)&&ismatrix(tmp3)&&length(tmp3)==3
                parent1 = tmp1;
                parent2 = tmp2;
                existParam = [0,0,100,100];
                mutationRate = tmp3;
                Criature=reprodCriature(parent1,parent2,mutationRate);
                Criature.position=[existParam(1),existParam(2)];
                Criature.life=existParam(3);
                Criature.energy=existParam(4);
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=1;
                return;
            elseif isstruct(tmp1)&&ismatrix(tmp2)&&ismatrix(tmp3)&&length(tmp2)==4&&length(tmp3)==3
                parent1 = tmp1;
                existParam = tmp2;
                mutationRate = tmp3;
                Criature=reprodCriature(parent1,parent1,mutationRate);
                Criature.position=[existParam(1),existParam(2)];
                Criature.life=existParam(3);
                Criature.energy=existParam(4);
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=1;  
                return;
            elseif isstruct(tmp1)&&ismatrix(tmp2)&&ismatrix(tmp3)&&length(tmp2)==3&&length(tmp3)==4
                parent1 = tmp1;
                existParam = tmp3;
                mutationRate = tmp2;
                Criature=reprodCriature(parent1,parent1,mutationRate);
                Criature.position=[existParam(1),existParam(2)];
                Criature.life=existParam(3);
                Criature.energy=existParam(4);
                Criature.stomach=100;
                Criature.sexualDisponibility=false;
                status=1;    
                return;
            else
                Criature=struct;
                for i=1:4
                    Criature.(strcat("C",num2str(i)))=round(sprand(404,4,1));
                end
                Criature.C5=round(sprand(5,7,1));
                Criature.position=[0,0];
                Criature.life=100;
                Criature.energy=100;
                Criature.stomach=100;
                Criature.sexualDisponibility=0;
                status=0;%status
                return;
            end
            
        case 4
            parent1=varargin{1};
            parent2=varargin{2};
            existParam=varargin{3};
            mutationRate=varargin{4};
            Criature=reprodCriature(parent1,parent2,mutationRate);
            Criature.position=[existParam(1),existParam(2)];
            Criature.life=existParam(3);
            Criature.energy=existParam(4);
            Criature.stomach=100;
            Criature.sexualDisponibility=0;
            status=1;
            return;
            
        otherwise
            Criature=struct;
            for i=1:4
                Criature.(strcat("C",num2str(i)))=round(sprand(404,4,1));
            end
            Criature.C5=round(sprand(5,7,1));
            Criature.position=[0,0];
            Criature.life=100;
            Criature.energy=100;
            Criature.stomach=100;
            Criature.sexualDisponibility=0;
            status=0;%status
            return;
    end
else
    Criature=struct;
    for i=1:4
        Criature.(strcat("C",num2str(i)))=round(sprand(404,4,1));
    end
    Criature.C5=round(sprand(5,7,1));
    Criature.position=[0,0];
    Criature.life=100;
    Criature.energy=100;
    Criature.stomach=100;
    Criature.sexualDisponibility=0;
    status=0;%status
    return;
end
    