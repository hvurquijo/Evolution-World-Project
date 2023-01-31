function[babyCriature, status]=reprodCriature(parent1,parent2,mutationRate)
%%
%Function for reproduction of two criatures. parent1 and parent2 are two
%structures which contain all the digital chromosomes (dig-chrom) and all
%the information for reproduction. babyCriature is a structure of the
%parents reproduction.
%%
%all chromosomes are sparse matrix, mutationRate é 1x3 matrix (adition, deletion, change)
if isstruct(parent1)&&isstruct(parent2)
    
    tmp1 = length(fieldnames(parent1));
    tmp2 = length(fieldnames(parent2));
    
    if(tmp1>=5&&tmp2>=5)
        tmpbool=true;
        for i=1:5%minimum necessary chromosomes
            tmpbool = tmpbool&(~isempty(parent1.(strcat("C",num2str(i)))));
        end
        for ii=1:5
            tmpbool = tmpbool&(~isempty(parent2.(strcat("C",num2str(ii)))));
        end
        
        if tmpbool%Condições validas para reprodução
            babyCriature=struct;
            correctionRates1 = readC5(parent1.C5);
            correctionRates2 = readC5(parent2.C5);
            
            for j=1:max([tmp1,tmp2])
                if isfield(parent1,strcat("C",num2str(j)))&&randi([1,100])>50
                    if ~isempty(parent1.(strcat("C",num2str(j))))
                        babyCriature.(strcat("C",num2str(j)))=copyChromosome(parent1.(strcat("C",num2str(j))),correctionRates1(j,1),correctionRates1(j,2),mutationRate);
                    else
                        babyCriature.(strcat("C",num2str(j)))=copyChromosome(parent2.(strcat("C",num2str(j))),correctionRates2(j,1),correctionRates2(j,2),mutationRate);
                    end
                elseif isfield(parent2,strcat("C",num2str(j)))
                    if ~isempty(parent2.(strcat("C",num2str(j))))
                        babyCriature.(strcat("C",num2str(j)))=copyChromosome(parent2.(strcat("C",num2str(j))),correctionRates2(j,1),correctionRates2(j,2),mutationRate);
                    else
                        babyCriature.(strcat("C",num2str(j)))=copyChromosome(parent1.(strcat("C",num2str(j))),correctionRates1(j,1),correctionRates1(j,2),mutationRate);
                    end
                end
            end
            status=1;
        else
            
            babyCriature=struct([]);
            status = -1;
        end
    else
        babyCriature=struct([]);
        status = -1;
    end
else
    babyCriature=struct([]);
    status=-1;
    return;
end